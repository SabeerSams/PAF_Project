package com.spring.social_media_application.service;

import com.spring.social_media_application.comman.CommonResponse;
import com.spring.social_media_application.dto.MediaDTO;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface MediaService {
    /**
     * Upload Image
     *
     * @param mediaDTO - required data for upload image
     * @return success or fail response of upload image
     */
    CommonResponse uploadImage(MediaDTO mediaDTO) throws IOException;

    /**
     * Upload Video
     *
     * @param mediaDTO - required data for upload video
     * @return success or fail response of upload video
     */
    CommonResponse uploadVideo(MediaDTO mediaDTO) throws IOException;

    /**
     * Get Image
     *
     * @param id - required data for get image
     * @return success or fail response of get image
     */
    Optional<byte[]> getImageData(String id);

    /**
     * Get Video
     *
     * @param id - required data for get video
     * @return success or fail response of get video
     */
    Optional<byte[]> getVideoData(String id);

    /**
     * Delete image
     *
     * @param id - required data for delete image
     * @return success or fail response of delete image
     */
    CommonResponse deleteMediaById(String id);

    /**
     * Delete images
     *
     * @return success or fail response of delete images
     */
    CommonResponse deleteAllMedia();

    /**
     * Upload Images or videos
     *
     * @param files - required data for upload images or videos
     * @return success or fail response of upload images or videos
     */
    CommonResponse uploadBulkImage(List<MultipartFile> files);
}
