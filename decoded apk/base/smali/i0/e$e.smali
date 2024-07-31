.class public Li0/e$e;
.super Li0/e$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public final b:Z


# direct methods
.method public constructor <init>(Li0/e$c;Z)V
    .locals 0

    invoke-direct {p0, p1}, Li0/e$d;-><init>(Li0/e$c;)V

    iput-boolean p2, p0, Li0/e$e;->b:Z

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    iget-boolean v0, p0, Li0/e$e;->b:Z

    return v0
.end method
