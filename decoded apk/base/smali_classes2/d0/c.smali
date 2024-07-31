.class public final synthetic Ld0/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ld0/b$d;

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Ld0/b$d;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/c;->h:Ld0/b$d;

    iput p2, p0, Ld0/c;->i:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ld0/c;->h:Ld0/b$d;

    iget v1, p0, Ld0/c;->i:I

    invoke-static {v0, v1}, Ld0/b$d;->d(Ld0/b$d;I)V

    return-void
.end method
