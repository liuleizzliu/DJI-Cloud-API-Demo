//package com.dj.sample;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.integration.annotation.InboundChannelAdapter;
//import org.springframework.integration.annotation.Poller;
//import org.springframework.integration.annotation.ServiceActivator;
//import org.springframework.integration.channel.DirectChannel;
//import org.springframework.integration.config.EnableIntegration;
//import org.springframework.integration.core.MessageSource;
//import org.springframework.messaging.MessageChannel;
//import org.springframework.messaging.MessageHandler;
//
//import java.io.File;
//
//@Configuration
//@EnableIntegration
//public class BasicIntegrationConfig{
//    public String INPUT_DIR = "the_source_dir";
//    public String OUTPUT_DIR = "the_dest_dir";
//    public String FILE_PATTERN = "*.mpeg";
//
//    @Bean
//    public MessageChannel fileChannel() {
//        return new DirectChannel();
//    }
//
//    @Bean
//    @InboundChannelAdapter(value = "fileChannel", poller = @Poller(fixedDelay = "1000"))
//    public MessageSource<File> fileReadingMessageSource() {
//        FileReadingMessageSource sourceReader= new FileReadingMessageSource();
//        sourceReader.setDirectory(new File(INPUT_DIR));
//        sourceReader.setFilter(new SimplePatternFileListFilter(FILE_PATTERN));
//        return sourceReader;
//    }
//
//    @Bean
//    @ServiceActivator(inputChannel= "fileChannel")
//    public MessageHandler fileWritingMessageHandler() {
//        FileWritingMessageHandler handler = new FileWritingMessageHandler(new File(OUTPUT_DIR));
//        handler.setFileExistsMode(FileExistsMode.REPLACE);
//        handler.setExpectReply(false);
//        return handler;
//    }
//}