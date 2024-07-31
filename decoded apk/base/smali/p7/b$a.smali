.class public Lp7/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp7/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp7/b;->c(Ljava/lang/String;Lp7/a$b;)Lp7/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lp7/b;


# direct methods
.method public constructor <init>(Lp7/b;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lp7/b$a;->a:Ljava/lang/String;

    iput-object p1, p0, Lp7/b$a;->b:Lp7/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
