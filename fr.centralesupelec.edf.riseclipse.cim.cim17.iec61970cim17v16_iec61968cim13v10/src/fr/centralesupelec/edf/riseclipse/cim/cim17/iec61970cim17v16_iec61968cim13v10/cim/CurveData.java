/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData#getXvalue <em>Xvalue</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData#getY1value <em>Y1value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData#getY2value <em>Y2value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData#getY3value <em>Y3value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData#getCurve <em>Curve</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurveData()
 * @model
 * @generated
 */
public interface CurveData extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Xvalue</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xvalue</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xvalue</em>' attribute.
     * @see #isSetXvalue()
     * @see #unsetXvalue()
     * @see #setXvalue(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurveData_Xvalue()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CurveData.xvalue' kind='element'"
     * @generated
     */
    Float getXvalue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData#getXvalue <em>Xvalue</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xvalue</em>' attribute.
     * @see #isSetXvalue()
     * @see #unsetXvalue()
     * @see #getXvalue()
     * @generated
     */
    void setXvalue( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData#getXvalue <em>Xvalue</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXvalue()
     * @see #getXvalue()
     * @see #setXvalue(Float)
     * @generated
     */
    void unsetXvalue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData#getXvalue <em>Xvalue</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xvalue</em>' attribute is set.
     * @see #unsetXvalue()
     * @see #getXvalue()
     * @see #setXvalue(Float)
     * @generated
     */
    boolean isSetXvalue();

    /**
     * Returns the value of the '<em><b>Y1value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Y1value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Y1value</em>' attribute.
     * @see #isSetY1value()
     * @see #unsetY1value()
     * @see #setY1value(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurveData_Y1value()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CurveData.y1value' kind='element'"
     * @generated
     */
    Float getY1value();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData#getY1value <em>Y1value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y1value</em>' attribute.
     * @see #isSetY1value()
     * @see #unsetY1value()
     * @see #getY1value()
     * @generated
     */
    void setY1value( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData#getY1value <em>Y1value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetY1value()
     * @see #getY1value()
     * @see #setY1value(Float)
     * @generated
     */
    void unsetY1value();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData#getY1value <em>Y1value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Y1value</em>' attribute is set.
     * @see #unsetY1value()
     * @see #getY1value()
     * @see #setY1value(Float)
     * @generated
     */
    boolean isSetY1value();

    /**
     * Returns the value of the '<em><b>Y2value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Y2value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Y2value</em>' attribute.
     * @see #isSetY2value()
     * @see #unsetY2value()
     * @see #setY2value(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurveData_Y2value()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CurveData.y2value' kind='element'"
     * @generated
     */
    Float getY2value();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData#getY2value <em>Y2value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y2value</em>' attribute.
     * @see #isSetY2value()
     * @see #unsetY2value()
     * @see #getY2value()
     * @generated
     */
    void setY2value( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData#getY2value <em>Y2value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetY2value()
     * @see #getY2value()
     * @see #setY2value(Float)
     * @generated
     */
    void unsetY2value();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData#getY2value <em>Y2value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Y2value</em>' attribute is set.
     * @see #unsetY2value()
     * @see #getY2value()
     * @see #setY2value(Float)
     * @generated
     */
    boolean isSetY2value();

    /**
     * Returns the value of the '<em><b>Y3value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Y3value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Y3value</em>' attribute.
     * @see #isSetY3value()
     * @see #unsetY3value()
     * @see #setY3value(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurveData_Y3value()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CurveData.y3value' kind='element'"
     * @generated
     */
    Float getY3value();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData#getY3value <em>Y3value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y3value</em>' attribute.
     * @see #isSetY3value()
     * @see #unsetY3value()
     * @see #getY3value()
     * @generated
     */
    void setY3value( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData#getY3value <em>Y3value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetY3value()
     * @see #getY3value()
     * @see #setY3value(Float)
     * @generated
     */
    void unsetY3value();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData#getY3value <em>Y3value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Y3value</em>' attribute is set.
     * @see #unsetY3value()
     * @see #getY3value()
     * @see #setY3value(Float)
     * @generated
     */
    boolean isSetY3value();

    /**
     * Returns the value of the '<em><b>Curve</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getCurveDatas <em>Curve Datas</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Curve</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Curve</em>' reference.
     * @see #isSetCurve()
     * @see #unsetCurve()
     * @see #setCurve(Curve)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurveData_Curve()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getCurveDatas
     * @model opposite="CurveDatas" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CurveData.Curve' kind='element'"
     * @generated
     */
    Curve getCurve();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData#getCurve <em>Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Curve</em>' reference.
     * @see #isSetCurve()
     * @see #unsetCurve()
     * @see #getCurve()
     * @generated
     */
    void setCurve( Curve value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData#getCurve <em>Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCurve()
     * @see #getCurve()
     * @see #setCurve(Curve)
     * @generated
     */
    void unsetCurve();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData#getCurve <em>Curve</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Curve</em>' reference is set.
     * @see #unsetCurve()
     * @see #getCurve()
     * @see #setCurve(Curve)
     * @generated
     */
    boolean isSetCurve();

} // CurveData
