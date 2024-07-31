.class public final synthetic Lff/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lvn/hunghd/flutterdownloader/DownloadWorker;

.field public final synthetic i:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lvn/hunghd/flutterdownloader/DownloadWorker;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lff/c;->h:Lvn/hunghd/flutterdownloader/DownloadWorker;

    iput-object p2, p0, Lff/c;->i:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lff/c;->h:Lvn/hunghd/flutterdownloader/DownloadWorker;

    iget-object v1, p0, Lff/c;->i:Landroid/content/Context;

    invoke-static {v0, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->s(Lvn/hunghd/flutterdownloader/DownloadWorker;Landroid/content/Context;)V

    return-void
.end method
