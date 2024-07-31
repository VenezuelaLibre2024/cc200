.class public final synthetic Lc7/cb;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic h:Lc7/za;

.field public synthetic i:Lc7/v4;

.field public synthetic j:Landroid/app/job/JobParameters;


# direct methods
.method public synthetic constructor <init>(Lc7/za;Lc7/v4;Landroid/app/job/JobParameters;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/cb;->h:Lc7/za;

    iput-object p2, p0, Lc7/cb;->i:Lc7/v4;

    iput-object p3, p0, Lc7/cb;->j:Landroid/app/job/JobParameters;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lc7/cb;->h:Lc7/za;

    iget-object v1, p0, Lc7/cb;->i:Lc7/v4;

    iget-object v2, p0, Lc7/cb;->j:Landroid/app/job/JobParameters;

    invoke-virtual {v0, v1, v2}, Lc7/za;->e(Lc7/v4;Landroid/app/job/JobParameters;)V

    return-void
.end method
