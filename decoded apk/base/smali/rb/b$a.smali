.class public final Lrb/b$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrb/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ltd/g;)V
    .locals 0

    invoke-direct {p0}, Lrb/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;)Lrb/b;
    .locals 3

    const-string v0, "name"

    invoke-static {p2, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lrb/b;

    sget-object v1, Lrb/b$b;->h:Lrb/b$b;

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, p2, v2}, Lrb/b;-><init>(ILrb/b$b;Ljava/lang/String;Ltd/g;)V

    return-object v0
.end method

.method public final b(ILjava/lang/String;)Lrb/b;
    .locals 3

    const-string v0, "name"

    invoke-static {p2, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lrb/b;

    sget-object v1, Lrb/b$b;->i:Lrb/b$b;

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, p2, v2}, Lrb/b;-><init>(ILrb/b$b;Ljava/lang/String;Ltd/g;)V

    return-object v0
.end method
