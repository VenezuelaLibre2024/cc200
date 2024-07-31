.class public Lw7/o0;
.super Lw7/h;
.source ""

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw7/o0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Z

.field public l:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw7/q1;

    invoke-direct {v0}, Lw7/q1;-><init>()V

    sput-object v0, Lw7/o0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Lw7/h;-><init>()V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber."

    invoke-static {v0, v1}, Lh6/s;->b(ZLjava/lang/Object;)V

    iput-object p1, p0, Lw7/o0;->h:Ljava/lang/String;

    iput-object p2, p0, Lw7/o0;->i:Ljava/lang/String;

    iput-object p3, p0, Lw7/o0;->j:Ljava/lang/String;

    iput-boolean p4, p0, Lw7/o0;->k:Z

    iput-object p5, p0, Lw7/o0;->l:Ljava/lang/String;

    return-void
.end method

.method public static M(Ljava/lang/String;Ljava/lang/String;)Lw7/o0;
    .locals 7

    new-instance v6, Lw7/o0;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lw7/o0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    return-object v6
.end method

.method public static P(Ljava/lang/String;Ljava/lang/String;)Lw7/o0;
    .locals 7

    new-instance v6, Lw7/o0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x1

    move-object v0, v6

    move-object v3, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lw7/o0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    return-object v6
.end method


# virtual methods
.method public I()Ljava/lang/String;
    .locals 1

    const-string v0, "phone"

    return-object v0
.end method

.method public J()Ljava/lang/String;
    .locals 1

    const-string v0, "phone"

    return-object v0
.end method

.method public final K()Lw7/h;
    .locals 1

    invoke-virtual {p0}, Lw7/o0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw7/o0;

    return-object v0
.end method

.method public L()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw7/o0;->i:Ljava/lang/String;

    return-object v0
.end method

.method public final N(Z)Lw7/o0;
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lw7/o0;->k:Z

    return-object p0
.end method

.method public final O()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw7/o0;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final Q()Z
    .locals 1

    iget-boolean v0, p0, Lw7/o0;->k:Z

    return v0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 7

    new-instance v6, Lw7/o0;

    iget-object v1, p0, Lw7/o0;->h:Ljava/lang/String;

    invoke-virtual {p0}, Lw7/o0;->L()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lw7/o0;->j:Ljava/lang/String;

    iget-boolean v4, p0, Lw7/o0;->k:Z

    iget-object v5, p0, Lw7/o0;->l:Ljava/lang/String;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lw7/o0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    return-object v6
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Lw7/o0;->h:Ljava/lang/String;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lw7/o0;->L()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Lw7/o0;->j:Ljava/lang/String;

    const/4 v1, 0x4

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-boolean v0, p0, Lw7/o0;->k:Z

    const/4 v1, 0x5

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, Lw7/o0;->l:Ljava/lang/String;

    const/4 v1, 0x6

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, p2}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zzc()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw7/o0;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final zzd()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw7/o0;->l:Ljava/lang/String;

    return-object v0
.end method
