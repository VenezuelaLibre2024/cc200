.class public Le8/r$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le8/r;->k(Ll8/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Ll8/i;

.field public final synthetic i:Le8/r;


# direct methods
.method public constructor <init>(Le8/r;Ll8/i;)V
    .locals 0

    iput-object p1, p0, Le8/r$b;->i:Le8/r;

    iput-object p2, p0, Le8/r$b;->h:Ll8/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Le8/r$b;->i:Le8/r;

    iget-object v1, p0, Le8/r$b;->h:Ll8/i;

    invoke-static {v0, v1}, Le8/r;->a(Le8/r;Ll8/i;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
