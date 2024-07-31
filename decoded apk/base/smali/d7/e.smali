.class public final Ld7/e;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lf6/a$g;

.field public static final b:Lf6/a$g;

.field public static final c:Lf6/a$a;

.field public static final d:Lf6/a$a;

.field public static final e:Lcom/google/android/gms/common/api/Scope;

.field public static final f:Lcom/google/android/gms/common/api/Scope;

.field public static final g:Lf6/a;

.field public static final h:Lf6/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Lf6/a$g;

    invoke-direct {v0}, Lf6/a$g;-><init>()V

    sput-object v0, Ld7/e;->a:Lf6/a$g;

    new-instance v1, Lf6/a$g;

    invoke-direct {v1}, Lf6/a$g;-><init>()V

    sput-object v1, Ld7/e;->b:Lf6/a$g;

    new-instance v2, Ld7/b;

    invoke-direct {v2}, Ld7/b;-><init>()V

    sput-object v2, Ld7/e;->c:Lf6/a$a;

    new-instance v3, Ld7/c;

    invoke-direct {v3}, Ld7/c;-><init>()V

    sput-object v3, Ld7/e;->d:Lf6/a$a;

    new-instance v4, Lcom/google/android/gms/common/api/Scope;

    const-string v5, "profile"

    invoke-direct {v4, v5}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v4, Ld7/e;->e:Lcom/google/android/gms/common/api/Scope;

    new-instance v4, Lcom/google/android/gms/common/api/Scope;

    const-string v5, "email"

    invoke-direct {v4, v5}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v4, Ld7/e;->f:Lcom/google/android/gms/common/api/Scope;

    new-instance v4, Lf6/a;

    const-string v5, "SignIn.API"

    invoke-direct {v4, v5, v2, v0}, Lf6/a;-><init>(Ljava/lang/String;Lf6/a$a;Lf6/a$g;)V

    sput-object v4, Ld7/e;->g:Lf6/a;

    new-instance v0, Lf6/a;

    const-string v2, "SignIn.INTERNAL_API"

    invoke-direct {v0, v2, v3, v1}, Lf6/a;-><init>(Ljava/lang/String;Lf6/a$a;Lf6/a$g;)V

    sput-object v0, Ld7/e;->h:Lf6/a;

    return-void
.end method
