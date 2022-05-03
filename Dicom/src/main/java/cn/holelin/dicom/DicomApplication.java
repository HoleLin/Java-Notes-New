package cn.holelin.dicom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="cn.holelin")
public class DicomApplication {

    public static void main(String[] args) {
        SpringApplication.run(DicomApplication.class, args);
    }


}
