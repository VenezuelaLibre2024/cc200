.class public final synthetic Ln1/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Landroidx/profileinstaller/c$c;

.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/profileinstaller/c$c;ILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln1/e;->h:Landroidx/profileinstaller/c$c;

    iput p2, p0, Ln1/e;->i:I

    iput-object p3, p0, Ln1/e;->j:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ln1/e;->h:Landroidx/profileinstaller/c$c;

    iget v1, p0, Ln1/e;->i:I

    iget-object v2, p0, Ln1/e;->j:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Landroidx/profileinstaller/c;->a(Landroidx/profileinstaller/c$c;ILjava/lang/Object;)V

    return-void
.end method
