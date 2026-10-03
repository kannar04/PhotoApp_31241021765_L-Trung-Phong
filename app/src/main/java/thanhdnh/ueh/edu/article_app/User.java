package thanhdnh.ueh.edu.article_app;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {
  @SerializedName(value = "id", alternate = {"user_id", "article_id"})
  @Expose
  private int id;

  @SerializedName(value = "uname", alternate = {"username", "article_title"})
  @Expose
  private String uname;

  @SerializedName(value = "password", alternate = {"pass"})
  @Expose
  private String password;

  @SerializedName(value = "url_profile", alternate = {"profile_url", "article_image"})
  @Expose
  private String url_profile;

  @SerializedName(value = "short_bio", alternate = {"bio", "article_description"})
  @Expose
  private String short_bio;

  public User(int id, String uname, String password, String url_profile, String short_bio) {
    this.id = id;
    this.uname = uname;
    this.password = password;
    this.url_profile = url_profile;
    this.short_bio = short_bio;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }

  public String getUrl_profile() {
    return url_profile;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setUrl_profile(String url_profile) {
    this.url_profile = url_profile;
  }

  public String getShort_bio() {
    return short_bio;
  }

  public void setShort_bio(String short_bio) {
    this.short_bio = short_bio;
  }
}
