package com.trading.crypto.entity;

import com.trading.crypto.domain.VerificationType;
import lombok.Data;

@Data
public class TwoFactorAuth {

  private boolean isEnabled = false;
  private VerificationType sendTo;
}
