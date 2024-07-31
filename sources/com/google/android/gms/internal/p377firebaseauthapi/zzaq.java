package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class zzaq<E> extends zzal<E> implements List<E>, RandomAccess {
    private static final zzbg<Object> zza = new zzas(zzay.zza, 0);

    public static <E> zzaq<E> zza(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17) {
        return zzb(e10, e11, e12, e13, e14, e15, e16, e17);
    }

    public static <E> zzaq<E> zza(Collection<? extends E> collection) {
        if (!(collection instanceof zzal)) {
            return zzb(collection.toArray());
        }
        zzaq<E> zzc = ((zzal) collection).zzc();
        if (!zzc.zze()) {
            return zzc;
        }
        Object[] array = zzc.toArray();
        return zzb(array, array.length);
    }

    public static <E> zzaq<E> zza(Object[] objArr) {
        return zzb(objArr, objArr.length);
    }

    private static <E> zzaq<E> zzb(Object... objArr) {
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException("at index " + i10);
            }
        }
        return zzb(objArr, objArr.length);
    }

    public static <E> zzaq<E> zzb(Object[] objArr, int i10) {
        return i10 == 0 ? (zzaq<E>) zzay.zza : new zzay(objArr, i10);
    }

    public static <E> zzap<E> zzg() {
        return new zzap<>();
    }

    public static <E> zzaq<E> zzh() {
        return (zzaq<E>) zzay.zza;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzal, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == zzz.zza(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (zzw.zza(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator<E> it = list.iterator();
                int i11 = 0;
                while (true) {
                    if (i11 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        E e10 = get(i11);
                        i11++;
                        if (!zzw.zza(e10, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzal, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator() {
        return (zzbg) listIterator(0);
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int i10) {
        zzz.zzb(i10, size());
        return isEmpty() ? zza : new zzas(this, i10);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzal
    public int zza(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.List
    /* renamed from: zza */
    public zzaq<E> subList(int i10, int i11) {
        zzz.zza(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? (zzaq<E>) zzay.zza : new zzar(this, i10, i12);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzal
    @Deprecated
    public final zzaq<E> zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzal
    /* renamed from: zzd */
    public final zzbd<E> iterator() {
        return (zzbg) listIterator();
    }
}
