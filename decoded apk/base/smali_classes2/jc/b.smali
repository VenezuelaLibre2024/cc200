.class public Ljc/b;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final k:La3/a;


# instance fields
.field public a:Landroid/media/AudioRecord;

.field public b:I

.field public c:[S

.field public d:Ljc/a;

.field public e:Ljava/io/File;

.field public f:I

.field public g:Ljc/c;

.field public h:Lkc/a;

.field public i:Z

.field public j:Landroid/os/Handler;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, La3/a;->k:La3/a;

    sput-object v0, Ljc/b;->k:La3/a;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lkc/a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Ljc/b;->a:Landroid/media/AudioRecord;

    const/16 v0, -0x64

    iput v0, p0, Ljc/b;->f:I

    sget-object v0, Ljc/c;->h:Ljc/c;

    iput-object v0, p0, Ljc/b;->g:Ljc/c;

    const/4 v0, 0x0

    iput-boolean v0, p0, Ljc/b;->i:Z

    new-instance v0, Ljc/b$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ljc/b$a;-><init>(Ljc/b;Landroid/os/Looper;)V

    iput-object v0, p0, Ljc/b;->j:Landroid/os/Handler;

    iput-object p1, p0, Ljc/b;->e:Ljava/io/File;

    iput-object p2, p0, Ljc/b;->h:Lkc/a;

    return-void
.end method

.method public static synthetic a(Ljc/b;)Lkc/a;
    .locals 0

    iget-object p0, p0, Ljc/b;->h:Lkc/a;

    return-object p0
.end method

.method public static synthetic b(Ljc/b;)Landroid/media/AudioRecord;
    .locals 0

    iget-object p0, p0, Ljc/b;->a:Landroid/media/AudioRecord;

    return-object p0
.end method

.method public static synthetic c(Ljc/b;)V
    .locals 0

    invoke-virtual {p0}, Ljc/b;->u()V

    return-void
.end method

.method public static synthetic d(Ljc/b;)V
    .locals 0

    invoke-virtual {p0}, Ljc/b;->p()V

    return-void
.end method

.method public static synthetic e(Ljc/b;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Ljc/b;->x(Z)V

    return-void
.end method

.method public static synthetic f(Ljc/b;Ljc/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Ljc/b;->y(Ljc/c;)V

    return-void
.end method

.method public static synthetic g(Ljc/b;)[S
    .locals 0

    iget-object p0, p0, Ljc/b;->c:[S

    return-object p0
.end method

.method public static synthetic h(Ljc/b;)I
    .locals 0

    iget p0, p0, Ljc/b;->b:I

    return p0
.end method

.method public static synthetic i(Ljc/b;)I
    .locals 0

    iget p0, p0, Ljc/b;->f:I

    return p0
.end method

.method public static synthetic j(Ljc/b;I)I
    .locals 0

    iput p1, p0, Ljc/b;->f:I

    return p1
.end method

.method public static synthetic k(Ljc/b;)I
    .locals 2

    iget v0, p0, Ljc/b;->f:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ljc/b;->f:I

    return v0
.end method

.method public static synthetic l(Ljc/b;I)V
    .locals 0

    invoke-virtual {p0, p1}, Ljc/b;->s(I)V

    return-void
.end method

.method public static synthetic m(Ljc/b;)Ljc/a;
    .locals 0

    iget-object p0, p0, Ljc/b;->d:Ljc/a;

    return-object p0
.end method


# virtual methods
.method public A()V
    .locals 2

    invoke-virtual {p0}, Ljc/b;->o()Ljc/c;

    move-result-object v0

    sget-object v1, Ljc/c;->i:Ljc/c;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Ljc/b;->o()Ljc/c;

    move-result-object v0

    sget-object v1, Ljc/c;->k:Ljc/c;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Ljc/b;->o()Ljc/c;

    move-result-object v0

    sget-object v1, Ljc/c;->j:Ljc/c;

    if-ne v0, v1, :cond_1

    :cond_0
    sget-object v0, Ljc/c;->m:Ljc/c;

    invoke-virtual {p0, v0}, Ljc/b;->y(Ljc/c;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljc/b;->x(Z)V

    :cond_1
    return-void
.end method

.method public n()V
    .locals 1

    iget-boolean v0, p0, Ljc/b;->i:Z

    if-eqz v0, :cond_0

    sget-object v0, Ljc/c;->l:Ljc/c;

    invoke-virtual {p0, v0}, Ljc/b;->y(Ljc/c;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljc/b;->x(Z)V

    :cond_0
    return-void
.end method

.method public o()Ljc/c;
    .locals 1

    iget-object v0, p0, Ljc/b;->g:Ljc/c;

    return-object v0
.end method

.method public final p()V
    .locals 12

    sget-object v0, Ljc/b;->k:La3/a;

    invoke-virtual {v0}, La3/a;->b()I

    move-result v1

    const v2, 0xac44

    const/16 v3, 0x10

    invoke-static {v2, v3, v1}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    move-result v1

    iput v1, p0, Ljc/b;->b:I

    invoke-virtual {v0}, La3/a;->c()I

    move-result v1

    iget v3, p0, Ljc/b;->b:I

    div-int/2addr v3, v1

    rem-int/lit16 v4, v3, 0xa0

    const/16 v5, 0xa0

    if-eqz v4, :cond_0

    rsub-int v4, v4, 0xa0

    add-int/2addr v3, v4

    mul-int/2addr v3, v1

    iput v3, p0, Ljc/b;->b:I

    :cond_0
    new-instance v1, Landroid/media/AudioRecord;

    const/4 v7, 0x1

    const v8, 0xac44

    const/16 v9, 0x10

    invoke-virtual {v0}, La3/a;->b()I

    move-result v10

    iget v11, p0, Ljc/b;->b:I

    move-object v6, v1

    invoke-direct/range {v6 .. v11}, Landroid/media/AudioRecord;-><init>(IIIII)V

    iput-object v1, p0, Ljc/b;->a:Landroid/media/AudioRecord;

    iget v0, p0, Ljc/b;->b:I

    new-array v0, v0, [S

    iput-object v0, p0, Ljc/b;->c:[S

    const/4 v0, 0x1

    const/16 v1, 0x20

    const/4 v3, 0x4

    invoke-static {v2, v0, v2, v1, v3}, Lcom/czt/mp3recorder/util/LameUtil;->init(IIIII)V

    new-instance v0, Ljc/a;

    iget-object v1, p0, Ljc/b;->e:Ljava/io/File;

    iget v2, p0, Ljc/b;->b:I

    new-instance v3, Ljc/b$c;

    invoke-direct {v3, p0}, Ljc/b$c;-><init>(Ljc/b;)V

    invoke-direct {v0, v1, v2, v3}, Ljc/a;-><init>(Ljava/io/File;ILkc/a;)V

    iput-object v0, p0, Ljc/b;->d:Ljc/a;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    iget-object v0, p0, Ljc/b;->a:Landroid/media/AudioRecord;

    iget-object v1, p0, Ljc/b;->d:Ljc/a;

    invoke-virtual {v1}, Ljc/a;->h()Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/media/AudioRecord;->setRecordPositionUpdateListener(Landroid/media/AudioRecord$OnRecordPositionUpdateListener;Landroid/os/Handler;)V

    iget-object v0, p0, Ljc/b;->a:Landroid/media/AudioRecord;

    invoke-virtual {v0, v5}, Landroid/media/AudioRecord;->setPositionNotificationPeriod(I)I

    return-void
.end method

.method public q()Z
    .locals 1

    iget-boolean v0, p0, Ljc/b;->i:Z

    return v0
.end method

.method public r()V
    .locals 2

    invoke-virtual {p0}, Ljc/b;->o()Ljc/c;

    move-result-object v0

    sget-object v1, Ljc/c;->i:Ljc/c;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Ljc/b;->o()Ljc/c;

    move-result-object v0

    sget-object v1, Ljc/c;->j:Ljc/c;

    if-ne v0, v1, :cond_1

    :cond_0
    sget-object v0, Ljc/c;->k:Ljc/c;

    invoke-virtual {p0, v0}, Ljc/b;->y(Ljc/c;)V

    :cond_1
    return-void
.end method

.method public final s(I)V
    .locals 1

    iget-object v0, p0, Ljc/b;->j:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public final t(Ljc/c;)V
    .locals 2

    iget-object v0, p0, Ljc/b;->j:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    const/16 v1, 0x7d

    iput v1, v0, Landroid/os/Message;->what:I

    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object p1, p0, Ljc/b;->j:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final u()V
    .locals 1

    iget-object v0, p0, Ljc/b;->a:Landroid/media/AudioRecord;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Landroid/media/AudioRecord;->stop()V

    iget-object v0, p0, Ljc/b;->a:Landroid/media/AudioRecord;

    invoke-virtual {v0}, Landroid/media/AudioRecord;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Ljc/b;->a:Landroid/media/AudioRecord;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public v()V
    .locals 2

    invoke-virtual {p0}, Ljc/b;->o()Ljc/c;

    move-result-object v0

    sget-object v1, Ljc/c;->k:Ljc/c;

    if-ne v0, v1, :cond_0

    sget-object v0, Ljc/c;->j:Ljc/c;

    invoke-virtual {p0, v0}, Ljc/b;->y(Ljc/c;)V

    :cond_0
    return-void
.end method

.method public w(Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Ljc/b;->e:Ljava/io/File;

    return-void
.end method

.method public final x(Z)V
    .locals 0

    iput-boolean p1, p0, Ljc/b;->i:Z

    return-void
.end method

.method public final y(Ljc/c;)V
    .locals 2

    iput-object p1, p0, Ljc/b;->g:Ljc/c;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "status = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RecordMp3"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p1}, Ljc/b;->t(Ljc/c;)V

    return-void
.end method

.method public z()V
    .locals 1

    invoke-virtual {p0}, Ljc/b;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljc/b$b;

    invoke-direct {v0, p0}, Ljc/b$b;-><init>(Ljc/b;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method
