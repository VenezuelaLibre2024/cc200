.class public final Lv5/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lf6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/a<",
            "Lv5/c;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final b:Lf6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/a<",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lz5/a;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final d:La6/a;

.field public static final e:Lf6/a$g;

.field public static final f:Lf6/a$g;

.field public static final g:Lf6/a$a;

.field public static final h:Lf6/a$a;

.field public static final i:Lf6/a;

.field public static final j:Lcom/google/android/gms/internal/auth-api/zbd;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Lf6/a$g;

    invoke-direct {v0}, Lf6/a$g;-><init>()V

    sput-object v0, Lv5/a;->e:Lf6/a$g;

    new-instance v1, Lf6/a$g;

    invoke-direct {v1}, Lf6/a$g;-><init>()V

    sput-object v1, Lv5/a;->f:Lf6/a$g;

    new-instance v2, Lv5/d;

    invoke-direct {v2}, Lv5/d;-><init>()V

    sput-object v2, Lv5/a;->g:Lf6/a$a;

    new-instance v3, Lv5/e;

    invoke-direct {v3}, Lv5/e;-><init>()V

    sput-object v3, Lv5/a;->h:Lf6/a$a;

    sget-object v4, Lv5/b;->a:Lf6/a;

    sput-object v4, Lv5/a;->a:Lf6/a;

    new-instance v4, Lf6/a;

    const-string v5, "Auth.CREDENTIALS_API"

    invoke-direct {v4, v5, v2, v0}, Lf6/a;-><init>(Ljava/lang/String;Lf6/a$a;Lf6/a$g;)V

    sput-object v4, Lv5/a;->i:Lf6/a;

    new-instance v0, Lf6/a;

    const-string v2, "Auth.GOOGLE_SIGN_IN_API"

    invoke-direct {v0, v2, v3, v1}, Lf6/a;-><init>(Ljava/lang/String;Lf6/a$a;Lf6/a$g;)V

    sput-object v0, Lv5/a;->b:Lf6/a;

    sget-object v0, Lv5/b;->b:Lz5/a;

    sput-object v0, Lv5/a;->c:Lz5/a;

    new-instance v0, Lcom/google/android/gms/internal/auth-api/zbd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/auth-api/zbd;-><init>()V

    sput-object v0, Lv5/a;->j:Lcom/google/android/gms/internal/auth-api/zbd;

    new-instance v0, Lb6/h;

    invoke-direct {v0}, Lb6/h;-><init>()V

    sput-object v0, Lv5/a;->d:La6/a;

    return-void
.end method
