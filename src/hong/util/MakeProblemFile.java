package hong.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MakeProblemFile {
	private static final String FOLDER_PATH = System.getProperty("user.dir") + "/src/hong/";
	private static final String PROTO_CLASS_NAME = "Hong0000";
	private static final String FILE_EXTENSION = ".java";
	private static final String PROTO_FILE_PATH = PROTO_CLASS_NAME + FILE_EXTENSION;
	private static final String BOJ_URL = "https://www.acmicpc.net/problem/";
	private static final String PREFIX_FILE_NAME = "Hong";
	
	public static void main(String[] args) throws Exception {
		int problemNumber = getProblemNumber();
		String strProtoClass = getProtoFileContent();
		
		makeProblemFile(strProtoClass, problemNumber);
	}
	
	public static int getProblemNumber() throws IOException {
		System.out.println("생성할 문제 번호를 입력하세요.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int problemNumber = -1;
		
		do {
			try {
				problemNumber = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요.");
				continue;
			}
		} while (problemNumber < 0);
		
		System.out.println("입력한 숫자 = " + problemNumber);
		
		return problemNumber;
	}

	public static String getProtoFileContent() {
		FileChannel readFileChannel = null;
		StringBuilder sb = new StringBuilder();
		
		System.out.println(FOLDER_PATH + PROTO_FILE_PATH);
		try {
			readFileChannel = FileChannel.open(Paths.get(FOLDER_PATH + PROTO_FILE_PATH), StandardOpenOption.READ);
			ByteBuffer buffer = ByteBuffer.allocate(100);
			
			int byteCount;
			
			while ((byteCount = readFileChannel.read(buffer)) > -1) {
				buffer.flip();
				sb.append(Charset.defaultCharset().decode(buffer).toString());
				buffer.clear();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (readFileChannel != null) {
					readFileChannel.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return sb.toString();
	}
	
	public static void makeProblemFile(String protoClass, int problemNumber) {
		String problemUrl = BOJ_URL + problemNumber;
		String FilePath = FOLDER_PATH + PREFIX_FILE_NAME + String.valueOf(problemNumber) + FILE_EXTENSION;
		Path newFilePath = Paths.get(FilePath);
		
		FileChannel writeFileChannel = null;
		String newFileContent = getNewFileContent(protoClass, problemUrl, problemNumber);
		
		System.out.println("New File Path : " + FilePath);
		
		try {
			if (Files.exists(newFilePath)) {
				throw new IOException("이미 존재하는 파일이 있습니다.");
			}
			
			writeFileChannel = FileChannel.open(newFilePath, StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE);
			
			Charset charset = Charset.defaultCharset();
			ByteBuffer byteBuffer = charset.encode(newFileContent);
			
			int byteCount = writeFileChannel.write(byteBuffer);
			
			System.out.println("The file : " + byteCount + " bytes written");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writeFileChannel != null) {
					writeFileChannel.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static String getNewFileContent(String protoClass, String problemUrl, int problemNumber) {
		String commentPattern = "\\/\\*[\\n\\s]+\\*\\/";
		String newClassName = PREFIX_FILE_NAME + String.valueOf(problemNumber);
		
		protoClass = protoClass.replaceAll(commentPattern, "\\/\\*\n" + problemUrl + "\n\\*\\/");
		protoClass = protoClass.replace(PROTO_CLASS_NAME, newClassName);
		
		return protoClass;
	}
}
