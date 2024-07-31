.class public final synthetic Lff/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lvn/hunghd/flutterdownloader/DownloadWorker;

.field public final synthetic i:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lvn/hunghd/flutterdownloader/DownloadWorker;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lff/d;->h:Lvn/hunghd/flutterdownloader/DownloadWorker;

    iput-object p2, p0, Lff/d;->i:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lff/d;->h:Lvn/hunghd/flutterdownloader/DownloadWorker;

    iget-object v1, p0, Lff/d;->i:Ljava/util/List;

    invoke-static {v0, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->t(Lvn/hunghd/flutterdownloader/DownloadWorker;Ljava/util/List;)V

    return-void
.end method
