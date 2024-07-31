.class public final Lc7/z5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzv;


# instance fields
.field public final synthetic a:Lc7/u5;


# direct methods
.method public constructor <init>(Lc7/u5;)V
    .locals 0

    iput-object p1, p0, Lc7/z5;->a:Lc7/u5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/measurement/zzs;Ljava/lang/String;Ljava/util/List;ZZ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/measurement/zzs;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;ZZ)V"
        }
    .end annotation

    sget-object v0, Lc7/b6;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq p1, v2, :cond_7

    if-eq p1, v1, :cond_4

    if-eq p1, v0, :cond_1

    const/4 p4, 0x4

    if-eq p1, p4, :cond_0

    iget-object p1, p0, Lc7/z5;->a:Lc7/u5;

    invoke-virtual {p1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->E()Lc7/x4;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lc7/z5;->a:Lc7/u5;

    invoke-virtual {p1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->F()Lc7/x4;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lc7/z5;->a:Lc7/u5;

    invoke-virtual {p1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    if-eqz p4, :cond_2

    invoke-virtual {p1}, Lc7/v4;->I()Lc7/x4;

    move-result-object p1

    goto :goto_0

    :cond_2
    if-nez p5, :cond_3

    invoke-virtual {p1}, Lc7/v4;->H()Lc7/x4;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lc7/v4;->G()Lc7/x4;

    move-result-object p1

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lc7/z5;->a:Lc7/u5;

    invoke-virtual {p1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    if-eqz p4, :cond_5

    invoke-virtual {p1}, Lc7/v4;->D()Lc7/x4;

    move-result-object p1

    goto :goto_0

    :cond_5
    if-nez p5, :cond_6

    invoke-virtual {p1}, Lc7/v4;->C()Lc7/x4;

    move-result-object p1

    goto :goto_0

    :cond_6
    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    goto :goto_0

    :cond_7
    iget-object p1, p0, Lc7/z5;->a:Lc7/u5;

    invoke-virtual {p1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->A()Lc7/x4;

    move-result-object p1

    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p4

    const/4 p5, 0x0

    if-eq p4, v2, :cond_a

    if-eq p4, v1, :cond_9

    if-eq p4, v0, :cond_8

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void

    :cond_8
    invoke-interface {p3, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p5

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1, p2, p4, p5, p3}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_9
    invoke-interface {p3, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1, p2, p4, p3}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_a
    invoke-interface {p3, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
