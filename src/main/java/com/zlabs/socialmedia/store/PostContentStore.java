package com.zlabs.socialmedia.store;

import com.zlabs.socialmedia.entity.Post;
import org.springframework.content.commons.repository.ContentStore;
import org.springframework.content.rest.StoreRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@StoreRestResource
public interface PostContentStore extends ContentStore <Post, String>{
}
