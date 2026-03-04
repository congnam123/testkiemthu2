package service;

import entity.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    public List<SanPham> sanPhamList = new ArrayList<>();

    public List<SanPham> getAll(){
        return sanPhamList;
    }

    public SanPham findbyId(int idSP){
        for(SanPham sp :sanPhamList){
            if(sp.getIdSP() == idSP){
                return sp;
            }
        }
        return null;
    }

    // thêm mới
    public String addSinhVien(SanPham sp){
        if((sp.getTen() == null)){
            return "không được để trống";
        }
        sanPhamList.add(sp);
        return "thêm thành công";
    }

    public void deleteSp(int idSP){
        sanPhamList.removeIf(sp -> sp.getIdSP() == idSP );
    }

    public void updatesanpham(SanPham spmoi , int idSP){
        for(SanPham sp : sanPhamList){
            if(sp.getIdSP() == idSP){
                sp.setTen(spmoi.getTen());
                sp.setSoLuong(spmoi.getSoLuong());
                sp.setDonGia(spmoi.getDonGia());
                sp.setMoTa(spmoi.getMoTa());
            }
        }
    }
}
