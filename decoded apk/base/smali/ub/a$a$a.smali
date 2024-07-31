.class public Lub/a$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lvb/a$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lub/a$a;->a()Ljava/lang/Void;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lub/a$a;


# direct methods
.method public constructor <init>(Lub/a$a;)V
    .locals 0

    iput-object p1, p0, Lub/a$a$a;->a:Lub/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(D)V
    .locals 1

    iget-object v0, p0, Lub/a$a$a;->a:Lub/a$a;

    iget-object v0, v0, Lub/a$a;->a:Lub/b;

    invoke-interface {v0, p1, p2}, Lub/b;->b(D)V

    return-void
.end method
