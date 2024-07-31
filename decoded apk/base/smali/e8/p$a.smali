.class public Le8/p$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le8/v$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le8/p;->z(Ljava/lang/String;Ljava/lang/Thread$UncaughtExceptionHandler;Ll8/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Le8/p;


# direct methods
.method public constructor <init>(Le8/p;)V
    .locals 0

    iput-object p1, p0, Le8/p$a;->a:Le8/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ll8/i;Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Le8/p$a;->a:Le8/p;

    invoke-virtual {v0, p1, p2, p3}, Le8/p;->J(Ll8/i;Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method
