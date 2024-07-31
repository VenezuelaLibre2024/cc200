.class public Lr9/k;
.super Lr9/e;
.source ""


# instance fields
.field public final m:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(Lq9/h;Ln7/g;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lr9/e;-><init>(Lq9/h;Ln7/g;)V

    iput-object p3, p0, Lr9/k;->m:Lorg/json/JSONObject;

    const-string p1, "X-HTTP-Method-Override"

    const-string p2, "PATCH"

    invoke-virtual {p0, p1, p2}, Lr9/e;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "PUT"

    return-object v0
.end method

.method public g()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lr9/k;->m:Lorg/json/JSONObject;

    return-object v0
.end method
