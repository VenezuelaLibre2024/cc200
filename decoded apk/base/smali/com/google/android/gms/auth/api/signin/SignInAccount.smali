.class public Lcom/google/android/gms/auth/api/signin/SignInAccount;
.super Li6/a;
.source ""

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/auth/api/signin/SignInAccount;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final i:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

.field public final j:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, La6/k;

    invoke-direct {v0}, La6/k;-><init>()V

    sput-object v0, Lcom/google/android/gms/auth/api/signin/SignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/auth/api/signin/SignInAccount;->i:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    const-string p2, "8.3 and 8.4 SDKs require non-null email"

    invoke-static {p1, p2}, Lh6/s;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/auth/api/signin/SignInAccount;->h:Ljava/lang/String;

    const-string p1, "8.3 and 8.4 SDKs require non-null userId"

    invoke-static {p3, p1}, Lh6/s;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/auth/api/signin/SignInAccount;->j:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final I()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/SignInAccount;->i:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/SignInAccount;->h:Ljava/lang/String;

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/SignInAccount;->i:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    const/4 v2, 0x7

    invoke-static {p1, v2, v0, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object p2, p0, Lcom/google/android/gms/auth/api/signin/SignInAccount;->j:Ljava/lang/String;

    const/16 v0, 0x8

    invoke-static {p1, v0, p2, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v1}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
