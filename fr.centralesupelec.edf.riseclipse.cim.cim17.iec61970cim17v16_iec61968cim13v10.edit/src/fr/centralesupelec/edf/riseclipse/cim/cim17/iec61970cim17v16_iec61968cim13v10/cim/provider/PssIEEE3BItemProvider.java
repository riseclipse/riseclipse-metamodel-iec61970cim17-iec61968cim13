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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PssIEEE3B;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PssIEEE3B} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PssIEEE3BItemProvider extends PowerSystemStabilizerDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PssIEEE3BItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addA1PropertyDescriptor( object );
            addA2PropertyDescriptor( object );
            addA3PropertyDescriptor( object );
            addA4PropertyDescriptor( object );
            addA5PropertyDescriptor( object );
            addA6PropertyDescriptor( object );
            addA7PropertyDescriptor( object );
            addA8PropertyDescriptor( object );
            addInputSignal1TypePropertyDescriptor( object );
            addInputSignal2TypePropertyDescriptor( object );
            addKs1PropertyDescriptor( object );
            addKs2PropertyDescriptor( object );
            addT1PropertyDescriptor( object );
            addT2PropertyDescriptor( object );
            addTw1PropertyDescriptor( object );
            addTw2PropertyDescriptor( object );
            addTw3PropertyDescriptor( object );
            addVstmaxPropertyDescriptor( object );
            addVstminPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the A1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addA1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE3B_a1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE3B_a1_feature",
                                "_UI_PssIEEE3B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE3B_A1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the A2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addA2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE3B_a2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE3B_a2_feature",
                                "_UI_PssIEEE3B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE3B_A2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the A3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addA3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE3B_a3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE3B_a3_feature",
                                "_UI_PssIEEE3B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE3B_A3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the A4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addA4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE3B_a4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE3B_a4_feature",
                                "_UI_PssIEEE3B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE3B_A4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the A5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addA5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE3B_a5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE3B_a5_feature",
                                "_UI_PssIEEE3B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE3B_A5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the A6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addA6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE3B_a6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE3B_a6_feature",
                                "_UI_PssIEEE3B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE3B_A6(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the A7 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addA7PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE3B_a7_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE3B_a7_feature",
                                "_UI_PssIEEE3B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE3B_A7(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the A8 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addA8PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE3B_a8_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE3B_a8_feature",
                                "_UI_PssIEEE3B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE3B_A8(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Input Signal1 Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInputSignal1TypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE3B_inputSignal1Type_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE3B_inputSignal1Type_feature",
                                "_UI_PssIEEE3B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE3B_InputSignal1Type(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Input Signal2 Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInputSignal2TypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE3B_inputSignal2Type_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE3B_inputSignal2Type_feature",
                                "_UI_PssIEEE3B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE3B_InputSignal2Type(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ks1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKs1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE3B_ks1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE3B_ks1_feature",
                                "_UI_PssIEEE3B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE3B_Ks1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ks2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKs2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE3B_ks2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE3B_ks2_feature",
                                "_UI_PssIEEE3B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE3B_Ks2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE3B_t1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE3B_t1_feature",
                                "_UI_PssIEEE3B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE3B_T1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE3B_t2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE3B_t2_feature",
                                "_UI_PssIEEE3B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE3B_T2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tw1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTw1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE3B_tw1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE3B_tw1_feature",
                                "_UI_PssIEEE3B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE3B_Tw1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tw2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTw2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE3B_tw2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE3B_tw2_feature",
                                "_UI_PssIEEE3B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE3B_Tw2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tw3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTw3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE3B_tw3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE3B_tw3_feature",
                                "_UI_PssIEEE3B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE3B_Tw3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vstmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVstmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE3B_vstmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE3B_vstmax_feature",
                                "_UI_PssIEEE3B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE3B_Vstmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vstmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVstminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssIEEE3B_vstmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE3B_vstmin_feature",
                                "_UI_PssIEEE3B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE3B_Vstmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns PssIEEE3B.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/PssIEEE3B" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( PssIEEE3B ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_PssIEEE3B_type" )
                : getString( "_UI_PssIEEE3B_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( PssIEEE3B.class ) ) {
        case CimPackage.PSS_IEEE3B__A1:
        case CimPackage.PSS_IEEE3B__A2:
        case CimPackage.PSS_IEEE3B__A3:
        case CimPackage.PSS_IEEE3B__A4:
        case CimPackage.PSS_IEEE3B__A5:
        case CimPackage.PSS_IEEE3B__A6:
        case CimPackage.PSS_IEEE3B__A7:
        case CimPackage.PSS_IEEE3B__A8:
        case CimPackage.PSS_IEEE3B__INPUT_SIGNAL1_TYPE:
        case CimPackage.PSS_IEEE3B__INPUT_SIGNAL2_TYPE:
        case CimPackage.PSS_IEEE3B__KS1:
        case CimPackage.PSS_IEEE3B__KS2:
        case CimPackage.PSS_IEEE3B__T1:
        case CimPackage.PSS_IEEE3B__T2:
        case CimPackage.PSS_IEEE3B__TW1:
        case CimPackage.PSS_IEEE3B__TW2:
        case CimPackage.PSS_IEEE3B__TW3:
        case CimPackage.PSS_IEEE3B__VSTMAX:
        case CimPackage.PSS_IEEE3B__VSTMIN:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
