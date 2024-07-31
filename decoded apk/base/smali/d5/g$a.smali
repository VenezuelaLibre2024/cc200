.class public Ld5/g$a;
.super Ld5/m;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld5/g;->x()Ld5/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic m:Ld5/g;


# direct methods
.method public constructor <init>(Ld5/g;)V
    .locals 0

    iput-object p1, p0, Ld5/g$a;->m:Ld5/g;

    invoke-direct {p0}, Ld5/m;-><init>()V

    return-void
.end method


# virtual methods
.method public v()V
    .locals 1

    iget-object v0, p0, Ld5/g$a;->m:Ld5/g;

    invoke-static {v0, p0}, Ld5/g;->v(Ld5/g;Lv3/h;)V

    return-void
.end method
