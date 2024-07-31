.class public final Lj6/d;
.super Lf6/e;
.source ""

# interfaces
.implements Lh6/y;


# static fields
.field public static final a:Lf6/a$g;

.field public static final b:Lf6/a$a;

.field public static final c:Lf6/a;

.field public static final synthetic d:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lf6/a$g;

    invoke-direct {v0}, Lf6/a$g;-><init>()V

    sput-object v0, Lj6/d;->a:Lf6/a$g;

    new-instance v1, Lj6/c;

    invoke-direct {v1}, Lj6/c;-><init>()V

    sput-object v1, Lj6/d;->b:Lf6/a$a;

    new-instance v2, Lf6/a;

    const-string v3, "ClientTelemetry.API"

    invoke-direct {v2, v3, v1, v0}, Lf6/a;-><init>(Ljava/lang/String;Lf6/a$a;Lf6/a$g;)V

    sput-object v2, Lj6/d;->c:Lf6/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lh6/z;)V
    .locals 2

    sget-object v0, Lj6/d;->c:Lf6/a;

    sget-object v1, Lf6/e$a;->c:Lf6/e$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lf6/e;-><init>(Landroid/content/Context;Lf6/a;Lf6/a$d;Lf6/e$a;)V

    return-void
.end method


# virtual methods
.method public final a(Lh6/w;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh6/w;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lg6/v;->a()Lg6/v$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Le6/d;

    sget-object v2, Lcom/google/android/gms/internal/base/zaf;->zaa:Le6/d;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lg6/v$a;->d([Le6/d;)Lg6/v$a;

    invoke-virtual {v0, v3}, Lg6/v$a;->c(Z)Lg6/v$a;

    new-instance v1, Lj6/b;

    invoke-direct {v1, p1}, Lj6/b;-><init>(Lh6/w;)V

    invoke-virtual {v0, v1}, Lg6/v$a;->b(Lg6/q;)Lg6/v$a;

    invoke-virtual {v0}, Lg6/v$a;->a()Lg6/v;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf6/e;->doBestEffortWrite(Lg6/v;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
