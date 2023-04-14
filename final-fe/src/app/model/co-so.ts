import {NhanVien} from './nhan-vien';

export interface CoSo {
  maCoSo?: number;
  tenCoSo?: string;
  ngayKhaiTruong?: string;
  diaChi?: string;
  nhanVien?: NhanVien;
}
