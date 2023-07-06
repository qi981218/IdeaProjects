import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import io.minio.UploadObjectArgs;
import io.minio.errors.*;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class MinioTest {

    @Test
    public void minioTest() throws IOException, ServerException, InsufficientDataException, InternalException, InvalidResponseException, InvalidKeyException, NoSuchAlgorithmException, XmlParserException, ErrorResponseException {
        //创建连接
        MinioClient minioClient = MinioClient.builder()
                .endpoint(" http://127.0.0.1:9000")
                .credentials("minioadmin", "minioadmin")
                .build();

        // 如果使用的 桶不存在 则创建 桶
        //boolean found = minioClient.bucketExists(BucketExistsArgs.builder().bucket(
        //        "huike-crm").build());
        //if (!found) {
        //    minioClient.makeBucket(MakeBucketArgs.builder().bucket("huike-crm").build());
        //}

//        //上传文件
//        minioClient.uploadObject(
//                UploadObjectArgs.builder()
//                        .bucket("huike-crm")
//                        .object("123.jpg")
//                        .filename("20.jpg")
//                        .build());

        //使用输入流上传
        File file = new File("1.jpg");
        minioClient.putObject(
                PutObjectArgs.builder()
                        .bucket("huike-crm")
                        .object("2022/9/29/" + UUID.randomUUID() + ".pdf")
                        .stream(new FileInputStream(file), file.length(), -1)
                        .build());
        System.out.println("上传成功");
    }
}
