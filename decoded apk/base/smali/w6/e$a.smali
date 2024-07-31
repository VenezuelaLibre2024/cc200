.class public final Lw6/e$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw6/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:I

.field public c:I

.field public d:J

.field public e:Z

.field public f:I

.field public g:Ljava/lang/String;

.field public h:Landroid/os/WorkSource;

.field public i:Lcom/google/android/gms/internal/location/zzd;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0xea60

    iput-wide v0, p0, Lw6/e$a;->a:J

    const/4 v0, 0x0

    iput v0, p0, Lw6/e$a;->b:I

    const/16 v1, 0x66

    iput v1, p0, Lw6/e$a;->c:I

    const-wide v1, 0x7fffffffffffffffL

    iput-wide v1, p0, Lw6/e$a;->d:J

    iput-boolean v0, p0, Lw6/e$a;->e:Z

    iput v0, p0, Lw6/e$a;->f:I

    const/4 v0, 0x0

    iput-object v0, p0, Lw6/e$a;->g:Ljava/lang/String;

    iput-object v0, p0, Lw6/e$a;->h:Landroid/os/WorkSource;

    iput-object v0, p0, Lw6/e$a;->i:Lcom/google/android/gms/internal/location/zzd;

    return-void
.end method


# virtual methods
.method public a()Lw6/e;
    .locals 13

    new-instance v12, Lw6/e;

    iget-wide v1, p0, Lw6/e$a;->a:J

    iget v3, p0, Lw6/e$a;->b:I

    iget v4, p0, Lw6/e$a;->c:I

    iget-wide v5, p0, Lw6/e$a;->d:J

    iget-boolean v7, p0, Lw6/e$a;->e:Z

    iget v8, p0, Lw6/e$a;->f:I

    iget-object v9, p0, Lw6/e$a;->g:Ljava/lang/String;

    new-instance v10, Landroid/os/WorkSource;

    iget-object v0, p0, Lw6/e$a;->h:Landroid/os/WorkSource;

    invoke-direct {v10, v0}, Landroid/os/WorkSource;-><init>(Landroid/os/WorkSource;)V

    iget-object v11, p0, Lw6/e$a;->i:Lcom/google/android/gms/internal/location/zzd;

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, Lw6/e;-><init>(JIIJZILjava/lang/String;Landroid/os/WorkSource;Lcom/google/android/gms/internal/location/zzd;)V

    return-object v12
.end method

.method public b(I)Lw6/e$a;
    .locals 0

    invoke-static {p1}, Lw6/b0;->a(I)I

    iput p1, p0, Lw6/e$a;->c:I

    return-object p0
.end method
