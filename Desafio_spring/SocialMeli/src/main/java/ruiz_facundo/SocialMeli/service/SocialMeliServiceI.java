package ruiz_facundo.SocialMeli.service;

import ruiz_facundo.SocialMeli.dto.*;

public interface SocialMeliServiceI {
    void follow(Long idNewFollower, Long idNewFollowed);
    void unfollow(Long idOldFollower, Long idOldFollwed);
    UserFollowersCountDTO getFollowersCount(Long idUser);
    UserFollowersDTO getFollowers(Long idUser, String criteria);
    UserFollowedDTO getFollowed(Long idUser, String criteria);
    void publish(RequestPostDTO newPostReq);
    UserPostsDTO getRecentPosts(Long idUser, String criteria);
    void publishPromo(RequestPromotionDTO newPromoReq);
    UserPromoCountDTO getPromosCount(Long idUser);
    UserNamePostsDTO getPromoPosts(Long idUser, String criteria);
}
