import {ViTri} from './vi-tri';

export interface NhanVien {
  maNhanVien?: number;
  tenNhanVien?: string;
  ngaySinh?: string;
  gioiTinh?: boolean;
  viTri?: ViTri;
}
