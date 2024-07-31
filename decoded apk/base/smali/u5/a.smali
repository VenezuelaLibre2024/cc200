.class public Lu5/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lf6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/a<",
            "Lf6/a$d$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lu5/b;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final c:Lf6/a$g;

.field public static final d:Lf6/a$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lf6/a$g;

    invoke-direct {v0}, Lf6/a$g;-><init>()V

    sput-object v0, Lu5/a;->c:Lf6/a$g;

    new-instance v1, Lu5/h;

    invoke-direct {v1}, Lu5/h;-><init>()V

    sput-object v1, Lu5/a;->d:Lf6/a$a;

    new-instance v2, Lf6/a;

    const-string v3, "WorkAccount.API"

    invoke-direct {v2, v3, v1, v0}, Lf6/a;-><init>(Ljava/lang/String;Lf6/a$a;Lf6/a$g;)V

    sput-object v2, Lu5/a;->a:Lf6/a;

    new-instance v0, Lcom/google/android/gms/internal/auth/zzal;

    invoke-direct {v0}, Lcom/google/android/gms/internal/auth/zzal;-><init>()V

    sput-object v0, Lu5/a;->b:Lu5/b;

    return-void
.end method
