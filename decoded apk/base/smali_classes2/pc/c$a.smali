.class public Lpc/c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lpc/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpc/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/Object;

.field public final synthetic e:Lpc/c;


# direct methods
.method public constructor <init>(Lpc/c;)V
    .locals 0

    iput-object p1, p0, Lpc/c$a;->e:Lpc/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lpc/c$a;->b:Ljava/lang/String;

    iput-object p2, p0, Lpc/c$a;->c:Ljava/lang/String;

    iput-object p3, p0, Lpc/c$a;->d:Ljava/lang/Object;

    return-void
.end method

.method public success(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lpc/c$a;->a:Ljava/lang/Object;

    return-void
.end method
