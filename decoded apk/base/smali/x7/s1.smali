.class public final Lx7/s1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lw7/h;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzags;
    .locals 2

    invoke-static {p0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const-class v0, Lw7/f0;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p0, Lw7/f0;

    invoke-static {p0, p1}, Lw7/f0;->L(Lw7/f0;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzags;

    move-result-object p0

    return-object p0

    :cond_0
    const-class v0, Lw7/l;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    check-cast p0, Lw7/l;

    invoke-static {p0, p1}, Lw7/l;->L(Lw7/l;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzags;

    move-result-object p0

    return-object p0

    :cond_1
    const-class v0, Lw7/z0;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    check-cast p0, Lw7/z0;

    invoke-static {p0, p1}, Lw7/z0;->L(Lw7/z0;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzags;

    move-result-object p0

    return-object p0

    :cond_2
    const-class v0, Lw7/d0;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    check-cast p0, Lw7/d0;

    invoke-static {p0, p1}, Lw7/d0;->L(Lw7/d0;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzags;

    move-result-object p0

    return-object p0

    :cond_3
    const-class v0, Lw7/s0;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_4

    check-cast p0, Lw7/s0;

    invoke-static {p0, p1}, Lw7/s0;->L(Lw7/s0;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzags;

    move-result-object p0

    return-object p0

    :cond_4
    const-class v0, Lw7/z1;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_5

    check-cast p0, Lw7/z1;

    invoke-static {p0, p1}, Lw7/z1;->O(Lw7/z1;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzags;

    move-result-object p0

    return-object p0

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unsupported credential type."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
