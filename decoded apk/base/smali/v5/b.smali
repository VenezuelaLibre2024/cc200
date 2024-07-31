.class public final Lv5/b;
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
.end field

.field public static final b:Lz5/a;

.field public static final c:Lf6/a$g;

.field public static final d:Lf6/a$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lf6/a$g;

    invoke-direct {v0}, Lf6/a$g;-><init>()V

    sput-object v0, Lv5/b;->c:Lf6/a$g;

    new-instance v1, Lv5/h;

    invoke-direct {v1}, Lv5/h;-><init>()V

    sput-object v1, Lv5/b;->d:Lf6/a$a;

    new-instance v2, Lf6/a;

    const-string v3, "Auth.PROXY_API"

    invoke-direct {v2, v3, v1, v0}, Lf6/a;-><init>(Ljava/lang/String;Lf6/a$a;Lf6/a$g;)V

    sput-object v2, Lv5/b;->a:Lf6/a;

    new-instance v0, Lcom/google/android/gms/internal/auth/zzbt;

    invoke-direct {v0}, Lcom/google/android/gms/internal/auth/zzbt;-><init>()V

    sput-object v0, Lv5/b;->b:Lz5/a;

    return-void
.end method
