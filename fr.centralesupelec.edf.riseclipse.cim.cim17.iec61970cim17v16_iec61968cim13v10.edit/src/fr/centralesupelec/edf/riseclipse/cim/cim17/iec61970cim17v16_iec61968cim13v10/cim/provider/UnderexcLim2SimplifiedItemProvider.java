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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnderexcLim2SimplifiedItemProvider extends UnderexcitationLimiterDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnderexcLim2SimplifiedItemProvider( AdapterFactory adapterFactory ) {
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

            addKuiPropertyDescriptor( object );
            addP0PropertyDescriptor( object );
            addP1PropertyDescriptor( object );
            addQ0PropertyDescriptor( object );
            addQ1PropertyDescriptor( object );
            addVuimaxPropertyDescriptor( object );
            addVuiminPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Kui feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKuiPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_UnderexcLim2Simplified_kui_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLim2Simplified_kui_feature",
                        "_UI_UnderexcLim2Simplified_type" ),
                CimPackage.eINSTANCE.getUnderexcLim2Simplified_Kui(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the P0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addP0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_UnderexcLim2Simplified_p0_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLim2Simplified_p0_feature",
                        "_UI_UnderexcLim2Simplified_type" ),
                CimPackage.eINSTANCE.getUnderexcLim2Simplified_P0(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the P1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addP1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_UnderexcLim2Simplified_p1_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLim2Simplified_p1_feature",
                        "_UI_UnderexcLim2Simplified_type" ),
                CimPackage.eINSTANCE.getUnderexcLim2Simplified_P1(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Q0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQ0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_UnderexcLim2Simplified_q0_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLim2Simplified_q0_feature",
                        "_UI_UnderexcLim2Simplified_type" ),
                CimPackage.eINSTANCE.getUnderexcLim2Simplified_Q0(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Q1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQ1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_UnderexcLim2Simplified_q1_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLim2Simplified_q1_feature",
                        "_UI_UnderexcLim2Simplified_type" ),
                CimPackage.eINSTANCE.getUnderexcLim2Simplified_Q1(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vuimax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVuimaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_UnderexcLim2Simplified_vuimax_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLim2Simplified_vuimax_feature",
                        "_UI_UnderexcLim2Simplified_type" ),
                CimPackage.eINSTANCE.getUnderexcLim2Simplified_Vuimax(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vuimin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVuiminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_UnderexcLim2Simplified_vuimin_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLim2Simplified_vuimin_feature",
                        "_UI_UnderexcLim2Simplified_type" ),
                CimPackage.eINSTANCE.getUnderexcLim2Simplified_Vuimin(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns UnderexcLim2Simplified.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/UnderexcLim2Simplified" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( UnderexcLim2Simplified ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_UnderexcLim2Simplified_type" )
                : getString( "_UI_UnderexcLim2Simplified_type" ) + " " + label;
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

        switch( notification.getFeatureID( UnderexcLim2Simplified.class ) ) {
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__KUI:
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P0:
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P1:
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q0:
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q1:
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMAX:
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMIN:
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
