.class public Lv3/j$a;
.super Ljava/lang/Thread;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv3/j;-><init>([Lv3/g;[Lv3/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lv3/j;


# direct methods
.method public constructor <init>(Lv3/j;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lv3/j$a;->h:Lv3/j;

    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lv3/j$a;->h:Lv3/j;

    invoke-static {v0}, Lv3/j;->e(Lv3/j;)V

    return-void
.end method
