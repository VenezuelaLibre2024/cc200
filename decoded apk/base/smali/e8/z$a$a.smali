.class public Le8/z$a$a;
.super Le8/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le8/z$a;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Ljava/lang/Runnable;

.field public final synthetic i:Le8/z$a;


# direct methods
.method public constructor <init>(Le8/z$a;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Le8/z$a$a;->i:Le8/z$a;

    iput-object p2, p0, Le8/z$a$a;->h:Ljava/lang/Runnable;

    invoke-direct {p0}, Le8/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Le8/z$a$a;->h:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
