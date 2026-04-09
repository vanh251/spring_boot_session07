package ra.edu.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CandidateUpdateDTO {
    @NotBlank(message = "Không được để trống địa chỉ")
    private String address;
    @Size(max = 200, message = "Tiểu sử không được vượt quá 200 ký tự")
    private String bio;
}
