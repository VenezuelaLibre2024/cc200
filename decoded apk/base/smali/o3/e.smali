.class public abstract Lo3/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo3/e$a;
    }
.end annotation


# static fields
.field public static final a:Lo3/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lo3/e;->a()Lo3/e$a;

    move-result-object v0

    const-wide/32 v1, 0xa00000

    invoke-virtual {v0, v1, v2}, Lo3/e$a;->f(J)Lo3/e$a;

    move-result-object v0

    const/16 v1, 0xc8

    invoke-virtual {v0, v1}, Lo3/e$a;->d(I)Lo3/e$a;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Lo3/e$a;->b(I)Lo3/e$a;

    move-result-object v0

    const-wide/32 v1, 0x240c8400

    invoke-virtual {v0, v1, v2}, Lo3/e$a;->c(J)Lo3/e$a;

    move-result-object v0

    const v1, 0x14000

    invoke-virtual {v0, v1}, Lo3/e$a;->e(I)Lo3/e$a;

    move-result-object v0

    invoke-virtual {v0}, Lo3/e$a;->a()Lo3/e;

    move-result-object v0

    sput-object v0, Lo3/e;->a:Lo3/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lo3/e$a;
    .locals 1

    new-instance v0, Lo3/a$b;

    invoke-direct {v0}, Lo3/a$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()I
.end method

.method public abstract c()J
.end method

.method public abstract d()I
.end method

.method public abstract e()I
.end method

.method public abstract f()J
.end method
