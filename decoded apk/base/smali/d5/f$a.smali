.class public Ld5/f$a;
.super Ld5/m;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld5/f;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic m:Ld5/f;


# direct methods
.method public constructor <init>(Ld5/f;)V
    .locals 0

    iput-object p1, p0, Ld5/f$a;->m:Ld5/f;

    invoke-direct {p0}, Ld5/m;-><init>()V

    return-void
.end method


# virtual methods
.method public v()V
    .locals 1

    iget-object v0, p0, Ld5/f$a;->m:Ld5/f;

    invoke-static {v0, p0}, Ld5/f;->e(Ld5/f;Ld5/m;)V

    return-void
.end method
