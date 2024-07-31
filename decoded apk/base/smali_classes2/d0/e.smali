.class public final synthetic Ld0/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ld0/b$d;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ld0/b$d;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/e;->h:Ld0/b$d;

    iput-object p2, p0, Ld0/e;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ld0/e;->h:Ld0/b$d;

    iget-object v1, p0, Ld0/e;->i:Ljava/lang/String;

    invoke-static {v0, v1}, Ld0/b$d;->a(Ld0/b$d;Ljava/lang/String;)V

    return-void
.end method
