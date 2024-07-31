.class public final Ll7/a$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field public static final d:Ll7/a$e;


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:Ljava/util/concurrent/Executor;

.field public c:Ll7/a$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll7/a$e;

    invoke-direct {v0}, Ll7/a$e;-><init>()V

    sput-object v0, Ll7/a$e;->d:Ll7/a$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Ll7/a$e;->a:Ljava/lang/Runnable;

    iput-object v0, p0, Ll7/a$e;->b:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll7/a$e;->a:Ljava/lang/Runnable;

    iput-object p2, p0, Ll7/a$e;->b:Ljava/util/concurrent/Executor;

    return-void
.end method
