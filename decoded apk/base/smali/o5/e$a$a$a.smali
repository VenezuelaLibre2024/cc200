.class public final Lo5/e$a$a$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo5/e$a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/os/Handler;

.field public final b:Lo5/e$a;

.field public c:Z


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lo5/e$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo5/e$a$a$a;->a:Landroid/os/Handler;

    iput-object p2, p0, Lo5/e$a$a$a;->b:Lo5/e$a;

    return-void
.end method

.method public static synthetic a(Lo5/e$a$a$a;)Lo5/e$a;
    .locals 0

    iget-object p0, p0, Lo5/e$a$a$a;->b:Lo5/e$a;

    return-object p0
.end method

.method public static synthetic b(Lo5/e$a$a$a;)Z
    .locals 0

    iget-boolean p0, p0, Lo5/e$a$a$a;->c:Z

    return p0
.end method

.method public static synthetic c(Lo5/e$a$a$a;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lo5/e$a$a$a;->a:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method public d()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo5/e$a$a$a;->c:Z

    return-void
.end method
