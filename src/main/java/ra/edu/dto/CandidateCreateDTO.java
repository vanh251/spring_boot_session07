package ra.edu.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CandidateCreateDTO {
    @NotBlank(message = "Không được để trống họ tên")
    @Length(min = 5, max = 50, message = "Họ tên phải có độ dài từ 5 đến 50 ký tự")
    private String fullName;
    @NotBlank(message = "Không được để trống email")
    @Email(message = "Email không hợp lệ")
    private String email;
    @Min(value = 18, message = "Tuổi phải lớn hơn hoặc bằng 18")
    private int age;
    //so nguyen, khong am
    @Min(value = 0, message = "Số năm kinh nghiệm phải là số nguyên lớn hơn hoặc bằng 0")
    private int yearOfExperience;
    @NotBlank(message = "Không được để trống địa chỉ")
    private String address;
    @Size(max = 200, message = "Tiểu sử không được vượt quá 200 ký tự")
    private String bio;
    @Pattern(regexp = "^(\\+84|0)\\d{9}$", message = "Số điện thoại không hợp lệ, phải bắt đầu bằng +84 hoặc 0 và có 10 chữ số")
    private String phone;
}
