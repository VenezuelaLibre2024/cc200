.class public Lda/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/a;-><init>(Lx6/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lda/a;


# direct methods
.method public constructor <init>(Lda/a;)V
    .locals 0

    iput-object p1, p0, Lda/a$a;->h:Lda/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lda/a$a;->h:Lda/a;

    invoke-virtual {v0}, Lda/a;->f()V

    return-void
.end method
