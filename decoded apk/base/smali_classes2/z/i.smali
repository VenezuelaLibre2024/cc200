.class public final synthetic Lz/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lz/h$f;

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Lz/h$f;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/i;->h:Lz/h$f;

    iput p2, p0, Lz/i;->i:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz/i;->h:Lz/h$f;

    iget v1, p0, Lz/i;->i:I

    invoke-static {v0, v1}, Lz/h$f;->a(Lz/h$f;I)V

    return-void
.end method
