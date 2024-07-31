.class public final Le5/e$c;
.super Ld5/m;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le5/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public m:Lv3/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/h$a<",
            "Le5/e$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv3/h$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/h$a<",
            "Le5/e$c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ld5/m;-><init>()V

    iput-object p1, p0, Le5/e$c;->m:Lv3/h$a;

    return-void
.end method


# virtual methods
.method public final v()V
    .locals 1

    iget-object v0, p0, Le5/e$c;->m:Lv3/h$a;

    invoke-interface {v0, p0}, Lv3/h$a;->a(Lv3/h;)V

    return-void
.end method
