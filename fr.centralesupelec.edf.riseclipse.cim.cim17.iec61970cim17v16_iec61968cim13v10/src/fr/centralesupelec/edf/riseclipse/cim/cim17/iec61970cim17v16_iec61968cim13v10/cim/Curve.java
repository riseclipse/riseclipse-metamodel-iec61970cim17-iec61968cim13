/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getCurveStyle <em>Curve Style</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getXMultiplier <em>XMultiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getXUnit <em>XUnit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY1Multiplier <em>Y1 Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY1Unit <em>Y1 Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY2Multiplier <em>Y2 Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY2Unit <em>Y2 Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY3Multiplier <em>Y3 Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY3Unit <em>Y3 Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getCurveDatas <em>Curve Datas</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurve()
 * @model
 * @generated
 */
public interface Curve extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Curve Style</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveStyle}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Curve Style</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Curve Style</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveStyle
     * @see #isSetCurveStyle()
     * @see #unsetCurveStyle()
     * @see #setCurveStyle(CurveStyle)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurve_CurveStyle()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Curve.curveStyle' kind='element'"
     * @generated
     */
    CurveStyle getCurveStyle();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getCurveStyle <em>Curve Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Curve Style</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveStyle
     * @see #isSetCurveStyle()
     * @see #unsetCurveStyle()
     * @see #getCurveStyle()
     * @generated
     */
    void setCurveStyle( CurveStyle value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getCurveStyle <em>Curve Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCurveStyle()
     * @see #getCurveStyle()
     * @see #setCurveStyle(CurveStyle)
     * @generated
     */
    void unsetCurveStyle();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getCurveStyle <em>Curve Style</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Curve Style</em>' attribute is set.
     * @see #unsetCurveStyle()
     * @see #getCurveStyle()
     * @see #setCurveStyle(CurveStyle)
     * @generated
     */
    boolean isSetCurveStyle();

    /**
     * Returns the value of the '<em><b>XMultiplier</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XMultiplier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XMultiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier
     * @see #isSetXMultiplier()
     * @see #unsetXMultiplier()
     * @see #setXMultiplier(UnitMultiplier)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurve_XMultiplier()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Curve.xMultiplier' kind='element'"
     * @generated
     */
    UnitMultiplier getXMultiplier();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getXMultiplier <em>XMultiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XMultiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier
     * @see #isSetXMultiplier()
     * @see #unsetXMultiplier()
     * @see #getXMultiplier()
     * @generated
     */
    void setXMultiplier( UnitMultiplier value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getXMultiplier <em>XMultiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXMultiplier()
     * @see #getXMultiplier()
     * @see #setXMultiplier(UnitMultiplier)
     * @generated
     */
    void unsetXMultiplier();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getXMultiplier <em>XMultiplier</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XMultiplier</em>' attribute is set.
     * @see #unsetXMultiplier()
     * @see #getXMultiplier()
     * @see #setXMultiplier(UnitMultiplier)
     * @generated
     */
    boolean isSetXMultiplier();

    /**
     * Returns the value of the '<em><b>XUnit</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XUnit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XUnit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol
     * @see #isSetXUnit()
     * @see #unsetXUnit()
     * @see #setXUnit(UnitSymbol)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurve_XUnit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Curve.xUnit' kind='element'"
     * @generated
     */
    UnitSymbol getXUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getXUnit <em>XUnit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XUnit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol
     * @see #isSetXUnit()
     * @see #unsetXUnit()
     * @see #getXUnit()
     * @generated
     */
    void setXUnit( UnitSymbol value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getXUnit <em>XUnit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXUnit()
     * @see #getXUnit()
     * @see #setXUnit(UnitSymbol)
     * @generated
     */
    void unsetXUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getXUnit <em>XUnit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XUnit</em>' attribute is set.
     * @see #unsetXUnit()
     * @see #getXUnit()
     * @see #setXUnit(UnitSymbol)
     * @generated
     */
    boolean isSetXUnit();

    /**
     * Returns the value of the '<em><b>Y1 Multiplier</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Y1 Multiplier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Y1 Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier
     * @see #isSetY1Multiplier()
     * @see #unsetY1Multiplier()
     * @see #setY1Multiplier(UnitMultiplier)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurve_Y1Multiplier()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Curve.y1Multiplier' kind='element'"
     * @generated
     */
    UnitMultiplier getY1Multiplier();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY1Multiplier <em>Y1 Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y1 Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier
     * @see #isSetY1Multiplier()
     * @see #unsetY1Multiplier()
     * @see #getY1Multiplier()
     * @generated
     */
    void setY1Multiplier( UnitMultiplier value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY1Multiplier <em>Y1 Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetY1Multiplier()
     * @see #getY1Multiplier()
     * @see #setY1Multiplier(UnitMultiplier)
     * @generated
     */
    void unsetY1Multiplier();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY1Multiplier <em>Y1 Multiplier</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Y1 Multiplier</em>' attribute is set.
     * @see #unsetY1Multiplier()
     * @see #getY1Multiplier()
     * @see #setY1Multiplier(UnitMultiplier)
     * @generated
     */
    boolean isSetY1Multiplier();

    /**
     * Returns the value of the '<em><b>Y1 Unit</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Y1 Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Y1 Unit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol
     * @see #isSetY1Unit()
     * @see #unsetY1Unit()
     * @see #setY1Unit(UnitSymbol)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurve_Y1Unit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Curve.y1Unit' kind='element'"
     * @generated
     */
    UnitSymbol getY1Unit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY1Unit <em>Y1 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y1 Unit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol
     * @see #isSetY1Unit()
     * @see #unsetY1Unit()
     * @see #getY1Unit()
     * @generated
     */
    void setY1Unit( UnitSymbol value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY1Unit <em>Y1 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetY1Unit()
     * @see #getY1Unit()
     * @see #setY1Unit(UnitSymbol)
     * @generated
     */
    void unsetY1Unit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY1Unit <em>Y1 Unit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Y1 Unit</em>' attribute is set.
     * @see #unsetY1Unit()
     * @see #getY1Unit()
     * @see #setY1Unit(UnitSymbol)
     * @generated
     */
    boolean isSetY1Unit();

    /**
     * Returns the value of the '<em><b>Y2 Multiplier</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Y2 Multiplier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Y2 Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier
     * @see #isSetY2Multiplier()
     * @see #unsetY2Multiplier()
     * @see #setY2Multiplier(UnitMultiplier)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurve_Y2Multiplier()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Curve.y2Multiplier' kind='element'"
     * @generated
     */
    UnitMultiplier getY2Multiplier();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY2Multiplier <em>Y2 Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y2 Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier
     * @see #isSetY2Multiplier()
     * @see #unsetY2Multiplier()
     * @see #getY2Multiplier()
     * @generated
     */
    void setY2Multiplier( UnitMultiplier value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY2Multiplier <em>Y2 Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetY2Multiplier()
     * @see #getY2Multiplier()
     * @see #setY2Multiplier(UnitMultiplier)
     * @generated
     */
    void unsetY2Multiplier();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY2Multiplier <em>Y2 Multiplier</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Y2 Multiplier</em>' attribute is set.
     * @see #unsetY2Multiplier()
     * @see #getY2Multiplier()
     * @see #setY2Multiplier(UnitMultiplier)
     * @generated
     */
    boolean isSetY2Multiplier();

    /**
     * Returns the value of the '<em><b>Y2 Unit</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Y2 Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Y2 Unit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol
     * @see #isSetY2Unit()
     * @see #unsetY2Unit()
     * @see #setY2Unit(UnitSymbol)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurve_Y2Unit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Curve.y2Unit' kind='element'"
     * @generated
     */
    UnitSymbol getY2Unit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY2Unit <em>Y2 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y2 Unit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol
     * @see #isSetY2Unit()
     * @see #unsetY2Unit()
     * @see #getY2Unit()
     * @generated
     */
    void setY2Unit( UnitSymbol value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY2Unit <em>Y2 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetY2Unit()
     * @see #getY2Unit()
     * @see #setY2Unit(UnitSymbol)
     * @generated
     */
    void unsetY2Unit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY2Unit <em>Y2 Unit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Y2 Unit</em>' attribute is set.
     * @see #unsetY2Unit()
     * @see #getY2Unit()
     * @see #setY2Unit(UnitSymbol)
     * @generated
     */
    boolean isSetY2Unit();

    /**
     * Returns the value of the '<em><b>Y3 Multiplier</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Y3 Multiplier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Y3 Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier
     * @see #isSetY3Multiplier()
     * @see #unsetY3Multiplier()
     * @see #setY3Multiplier(UnitMultiplier)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurve_Y3Multiplier()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Curve.y3Multiplier' kind='element'"
     * @generated
     */
    UnitMultiplier getY3Multiplier();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY3Multiplier <em>Y3 Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y3 Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier
     * @see #isSetY3Multiplier()
     * @see #unsetY3Multiplier()
     * @see #getY3Multiplier()
     * @generated
     */
    void setY3Multiplier( UnitMultiplier value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY3Multiplier <em>Y3 Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetY3Multiplier()
     * @see #getY3Multiplier()
     * @see #setY3Multiplier(UnitMultiplier)
     * @generated
     */
    void unsetY3Multiplier();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY3Multiplier <em>Y3 Multiplier</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Y3 Multiplier</em>' attribute is set.
     * @see #unsetY3Multiplier()
     * @see #getY3Multiplier()
     * @see #setY3Multiplier(UnitMultiplier)
     * @generated
     */
    boolean isSetY3Multiplier();

    /**
     * Returns the value of the '<em><b>Y3 Unit</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Y3 Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Y3 Unit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol
     * @see #isSetY3Unit()
     * @see #unsetY3Unit()
     * @see #setY3Unit(UnitSymbol)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurve_Y3Unit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Curve.y3Unit' kind='element'"
     * @generated
     */
    UnitSymbol getY3Unit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY3Unit <em>Y3 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y3 Unit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol
     * @see #isSetY3Unit()
     * @see #unsetY3Unit()
     * @see #getY3Unit()
     * @generated
     */
    void setY3Unit( UnitSymbol value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY3Unit <em>Y3 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetY3Unit()
     * @see #getY3Unit()
     * @see #setY3Unit(UnitSymbol)
     * @generated
     */
    void unsetY3Unit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getY3Unit <em>Y3 Unit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Y3 Unit</em>' attribute is set.
     * @see #unsetY3Unit()
     * @see #getY3Unit()
     * @see #setY3Unit(UnitSymbol)
     * @generated
     */
    boolean isSetY3Unit();

    /**
     * Returns the value of the '<em><b>Curve Datas</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData#getCurve <em>Curve</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Curve Datas</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Curve Datas</em>' reference list.
     * @see #isSetCurveDatas()
     * @see #unsetCurveDatas()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurve_CurveDatas()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData#getCurve
     * @model opposite="Curve" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Curve.CurveDatas' kind='element'"
     * @generated
     */
    EList< CurveData > getCurveDatas();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getCurveDatas <em>Curve Datas</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCurveDatas()
     * @see #getCurveDatas()
     * @generated
     */
    void unsetCurveDatas();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve#getCurveDatas <em>Curve Datas</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Curve Datas</em>' reference list is set.
     * @see #unsetCurveDatas()
     * @see #getCurveDatas()
     * @generated
     */
    boolean isSetCurveDatas();

} // Curve
