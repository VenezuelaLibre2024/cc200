.class public Lh6/g;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lh6/g;",
            ">;"
        }
    .end annotation
.end field

.field public static final v:[Lcom/google/android/gms/common/api/Scope;

.field public static final w:[Le6/d;


# instance fields
.field public final h:I

.field public final i:I

.field public final j:I

.field public k:Ljava/lang/String;

.field public l:Landroid/os/IBinder;

.field public m:[Lcom/google/android/gms/common/api/Scope;

.field public n:Landroid/os/Bundle;

.field public o:Landroid/accounts/Account;

.field public p:[Le6/d;

.field public q:[Le6/d;

.field public final r:Z

.field public final s:I

.field public t:Z

.field public final u:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh6/o1;

    invoke-direct {v0}, Lh6/o1;-><init>()V

    sput-object v0, Lh6/g;->CREATOR:Landroid/os/Parcelable$Creator;

    const/4 v0, 0x0

    new-array v1, v0, [Lcom/google/android/gms/common/api/Scope;

    sput-object v1, Lh6/g;->v:[Lcom/google/android/gms/common/api/Scope;

    new-array v0, v0, [Le6/d;

    sput-object v0, Lh6/g;->w:[Le6/d;

    return-void
.end method

.method public constructor <init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Le6/d;[Le6/d;ZIZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    if-nez p6, :cond_0

    sget-object p6, Lh6/g;->v:[Lcom/google/android/gms/common/api/Scope;

    :cond_0
    if-nez p7, :cond_1

    new-instance p7, Landroid/os/Bundle;

    invoke-direct {p7}, Landroid/os/Bundle;-><init>()V

    :cond_1
    if-nez p9, :cond_2

    sget-object p9, Lh6/g;->w:[Le6/d;

    :cond_2
    if-nez p10, :cond_3

    sget-object p10, Lh6/g;->w:[Le6/d;

    :cond_3
    iput p1, p0, Lh6/g;->h:I

    iput p2, p0, Lh6/g;->i:I

    iput p3, p0, Lh6/g;->j:I

    const-string p2, "com.google.android.gms"

    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    iput-object p2, p0, Lh6/g;->k:Ljava/lang/String;

    goto :goto_0

    :cond_4
    iput-object p4, p0, Lh6/g;->k:Ljava/lang/String;

    :goto_0
    const/4 p2, 0x2

    if-ge p1, p2, :cond_6

    if-eqz p5, :cond_5

    invoke-static {p5}, Lh6/k$a;->c(Landroid/os/IBinder;)Lh6/k;

    move-result-object p1

    invoke-static {p1}, Lh6/a;->e(Lh6/k;)Landroid/accounts/Account;

    move-result-object p1

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p0, Lh6/g;->o:Landroid/accounts/Account;

    goto :goto_2

    :cond_6
    iput-object p5, p0, Lh6/g;->l:Landroid/os/IBinder;

    iput-object p8, p0, Lh6/g;->o:Landroid/accounts/Account;

    :goto_2
    iput-object p6, p0, Lh6/g;->m:[Lcom/google/android/gms/common/api/Scope;

    iput-object p7, p0, Lh6/g;->n:Landroid/os/Bundle;

    iput-object p9, p0, Lh6/g;->p:[Le6/d;

    iput-object p10, p0, Lh6/g;->q:[Le6/d;

    iput-boolean p11, p0, Lh6/g;->r:Z

    iput p12, p0, Lh6/g;->s:I

    iput-boolean p13, p0, Lh6/g;->t:Z

    iput-object p14, p0, Lh6/g;->u:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lh6/o1;->a(Lh6/g;Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zza()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh6/g;->u:Ljava/lang/String;

    return-object v0
.end method
